package com.example.demo;

public class Solution {

	public static int romanToInt(String s) {
		StringBuilder sb = new StringBuilder();
		int total = 0;
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			if (i != ch.length - 1) {
				switch ("" + ch[i] + ch[i + 1] + "") {
				case "CM":
					total = total + 900;
					sb.append("CM" + "=" + 900);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				case "CD":
					total = total + 400;
					sb.append("CD" + "=" + 400);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				case "XL":
					total = total + 40;
					sb.append("XL" + "=" + 40);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				case "XC":
					total = total + 90;
					sb.append("XC" + "=" + 90);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				case "IV":
					total = total + 4;
					sb.append("ÏV" + "=" + 4);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				case "IX":
					total = total + 9;
					sb.append("IX" + "=" + 9);
					i++;
					sb.append(appendCommaFullStop(i, ch.length - 1));
					continue;
				default:
					break;
				}
			}
			switch (ch[i]) {
			case ('I'):
				total = total + 1;
				sb.append(ch[i] + "=" + 1);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('V'):
				total = total + 5;
				sb.append(ch[i] + "=" + 5);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('X'):
				total = total + 10;
				sb.append(ch[i] + "=" + 10);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('L'):
				total = total + 50;
				sb.append(ch[i] + "=" + 50);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('C'):
				total = total + 100;
				sb.append(ch[i] + "=" + 100);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('D'):
				total = total + 500;
				sb.append(ch[i] + "=" + 500);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			case ('M'):
				total = total + 1000;
				sb.append(ch[i] + "=" + 1000);
				sb.append(appendCommaFullStop(i, ch.length - 1));
				break;
			default:
				break;
			}

		}
		System.out.println("Output: " + total);
		System.out.println("Explaination: " + sb.toString());
		return total;
	}

	public static String appendCommaFullStop(int i, int j) {
		if (i == j) {
			return ".";
		} else if (i != j) {
			return " , ";
		}
		return "";
	}

	public static void main(String[] args) {
		romanToInt("VVV");
	}
}
