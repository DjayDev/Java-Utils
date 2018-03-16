package com.djay.tools;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Locale;

public class LocalDateAxisTest extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(Locale.ENGLISH);
        ScrollPane rootScroll = new ScrollPane();
        VBox root = new VBox();
        rootScroll.setContent(root);
        Scene scene = new Scene(rootScroll, 800, 600);

        primaryStage.setScene(scene);

        root.getChildren().add(helloWorld());
        root.getChildren().add(createLineChartWithManyData());

        primaryStage.show();
    }

    private AnchorPane helloWorld() {
        Label label = new Label("Hello World!");
        AnchorPane result = new AnchorPane();
        result.getChildren().add(label);

        return  result;
    }

    private LineChart<LocalDate, Number> createLineChartWithManyData() {
        ObservableList<XYChart.Series<LocalDate, Number>> series = FXCollections.observableArrayList();

        LocalDateTimeAxis dateAxis = new LocalDateTimeAxis();
        NumberAxis numberAxis = new NumberAxis();
        LineChart<LocalDate, Number> result = new LineChart<>(dateAxis, numberAxis);
        return result;
    }
}