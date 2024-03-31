package md.ceiti.studiuindividualjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Sarcina3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private double HEIGHT = 500, WIDTH = 400;

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(20);
        root.setPadding(new Insets(10));
        TextArea textArea = new TextArea();
        textArea.setPrefHeight(HEIGHT-100);
        textArea.setWrapText(true);


        Button importButton = new Button("Download the data from file");
        importButton.setOnAction(e->{
            try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
                StringBuilder sb = new StringBuilder();
                String rand;
                while((rand = br.readLine())!=null) sb.append(rand).append('\n');
                textArea.setText(sb+"");
            }
            catch (IOException ioException){
                ioException.printStackTrace();
            }
        });

        Button processButton = new Button("Process data");
        processButton.setOnAction(e->{
            int m=5, n=6;
            int M[][] = new int[m][n];
            String text = textArea.getText();
            Scanner scanner = new Scanner(text);
            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j]= Integer.parseInt(scanner.next());
                }
            }
//
//            1 2 3 4 5 6
//            1 2 3 4 0 0
//            1 2 3 4 5 6
//            1 2 3 4 5 6
//            1 2 3 4 5 6
            int numaraZerouri=0;
            for(int j=0;j<n;j++) {
                if(M[1][j]==0) numaraZerouri++;
            }
            if(numaraZerouri>=2){
                int max0 = M[0][0],k=0;
                for(int j=1;j<n;j++)
                    if(M[0][j]>max0){
                        k=j;
                        max0=M[0][j];
                    }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        M[i][j]=0;
                    }
                }

                M[0][k]=max0/2;

                textArea.setText("");

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        textArea.setText(textArea.getText()+" "+M[i][j]);
                    }
                    textArea.setText(textArea.getText()+"\n");
                }
            }

        });
        Button saveButton = new Button("Save data to file");
        saveButton.setOnAction(e->{
            String text = textArea.getText();
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))){
                bw.write(textArea.getText());
                bw.close();
                textArea.setText("");
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        root.getChildren().addAll(textArea,importButton,processButton,saveButton);
        root.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Sarcina 3");
        stage.show();
    }
}
