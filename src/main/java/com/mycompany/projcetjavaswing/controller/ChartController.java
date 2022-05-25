/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.controller;

import com.mycompany.projcetjavaswing.model.Product;
import com.mycompany.projcetjavaswing.repository.ProductRepository;
import com.mycompany.projcetjavaswing.view.ChartPanell;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Admin
 */
public class ChartController {

    private static PieDataset dataset;

    private ChartPanell view;

    public ChartController(ChartPanell view) {
        this.view = view;
        this.view.setVisible(true);
        Listener();
    }
        public ChartPanell index() {
        return this.view;
    }
    public void Listener() {
        showChart();
//        showChart2();
    }

    public void showChart() {

        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

        this.view.getChartPane().removeAll();
        this.view.getChartPane().add(chartPanel, BorderLayout.CENTER);
        this.view.getChartPane().validate();

    }

    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "Sản Phẩm", "Số Lượng",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }
        private static CategoryDataset createDataset() {
        List<Product> products = ProductRepository.findAll();
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Product product : products) {
            dataset.addValue(product.getQuantity(), "Quantity", product.getNameproduct());
        }

        return dataset;
    }
            
        
        
//        
//    public void showChart2() {
//        ChartPanel chartPanel = new ChartPanel(createChart2());
//        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
//        this.view.getChartPane2().removeAll();
//        this.view.getChartPane2().add(chartPanel, BorderLayout.CENTER);
//        this.view.getChartPane2().validate();
//}
            
   private static JFreeChart createChart2() {
        JFreeChart chart = ChartFactory.createPieChart(
                "hoanmg", dataset, true, true, true);
        return chart;
    }
       private static PieDataset createDataset2() {

        List<Product> productss = ProductRepository.findAll();
         final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           for (Product product : productss) {
               dataset.addValue(product.getQuantity(), "Quantity", product.getNameproduct());
           }
        return (PieDataset) dataset;
    }


}
