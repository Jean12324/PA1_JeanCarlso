/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EA1_JEAN.model;

import jakarta.validation.constraints.*;

/**
 *
 * @author Jeanc
 */
public class Producto {

    @NotBlank(message = "El nombre del producto es obligatorio.")
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+)*$", message = "El nombre solo puede contener letras y espacios.")
    private String nombreProducto;

    @NotBlank(message = "La fecha de caducidad es obligatoria.")
    private String fechaCaducidad;

    @Min(value = 1, message = "El stock mínimo debe ser mayor o igual a 1.")
    @Digits(integer = 10, fraction = 0, message = "El stock mínimo debe ser un número entero.")
    private int stockMinimo;

    @Min(value = 1, message = "El stock máximo debe ser mayor o igual a 1.")
    @Digits(integer = 10, fraction = 0, message = "El stock máximo debe ser un número entero.")
    private int stockMaximo;

    @Positive(message = "El precio unitario debe ser mayor a 0.")
    @Digits(integer = 10, fraction = 2, message = "El precio debe ser un número válido con hasta 2 decimales.")
    private double precioUnitario;

    @NotBlank(message = "La categoría es obligatoria.")
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+)*$", message = "La categoría solo puede contener letras y espacios.")
    private String categoria;

    @NotBlank(message = "La marca es obligatoria.")
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+)*$", message = "La marca solo puede contener letras y espacios.")
    private String marca;

    // Getters y Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
