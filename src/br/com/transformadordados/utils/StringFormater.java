package br.com.transformadordados.utils;

public class StringFormater {
	public static String formataData(String data) {
		return "todate(" + data +", dd/MM/yyyy)";
	}
	
	public static String formataVarchar(String data) {
		return '"'+ data + '"';
	}
}
