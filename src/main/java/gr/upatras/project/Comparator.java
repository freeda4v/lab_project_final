package gr.upatras.project;

public class Comparator {
	public String compare(int num1, int num2) {
	    int sub = num1 - num2;
	    if (sub > 0) return "POSITIVE";
	    else if (sub == 0) return "ZERO";
	    else return "NEGATIVE";
	}
}
