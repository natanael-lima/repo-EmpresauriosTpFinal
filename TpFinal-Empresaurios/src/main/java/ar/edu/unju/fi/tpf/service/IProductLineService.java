package ar.edu.unju.fi.tpf.service;

import java.util.List;

import ar.edu.unju.fi.tpf.model.ProductLine;


public interface IProductLineService {
	
	public void guardarProductLine (ProductLine productline);
	
	public List<ProductLine> obtenerProductLines();
	
	public void eliminarProductLine(Long productLineId);
	
	public ProductLine buscarProductLine(Long productLineId);
	
}
