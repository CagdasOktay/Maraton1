package com.cagdas;

public class CustomString {

	public void uzunluk(String ifade) {

		System.out.println(ifade.length());

	}

	public void kýrpým(String kýrp) {

		System.out.println(kýrp.trim());

	}

	public void karakter(String ifadee) {

		System.out.println(ifadee.chars());

	}

	public void altindex(String ifadeee) {

		System.out.println(ifadeee.substring(2));

	}

	public void bul(String ifadeeee) {

		System.out.println(ifadeeee.split(ifadeeee));

	}

	public void kucukharf(String araBaci) {

		System.out.println(araBaci.toLowerCase());

	}

	public void buyukharf(String GoldenState) {

		System.out.println(GoldenState.toUpperCase());

	}

	public void esitlik(String Chicago) {

		System.out.println(Chicago.equals(Chicago));

	}

	public void ilkharf(String Cagdas) {

		System.out.println(Cagdas.startsWith(Cagdas));

	}

	public void sonharf(String Oktay) {

		System.out.println(Oktay.startsWith(Oktay));

	}

}
