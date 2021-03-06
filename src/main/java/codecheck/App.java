package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		String LINE_SEPARATOR = System.getProperty("line.separator");

		String output = "";

		List<String> paramList = new ArrayList<String>();

		for (int i = 0; i < args.length; i++) {
			paramList.add(args[i]);
		}

		String check;
		int num;

		for ( int i =0; i < paramList.size(); i++) {

			try {

				num =  Integer.parseInt(paramList.get(i));
				check = paramList.get(i);
				Boolean checkFlg = false;

				// 1000以下の場合
				if(num <= 1000) {

					for (int j = 0; j < check.length(); j++) {

						// 3のつく場合
						if ("3".equals(String.valueOf(check.charAt(j)))) {
							// 3の倍数でかつ3のつく1000以下の非負整数の場合
							if (num % 3 == 0) {

								if (output.isEmpty()) {
									output = "dumb";
								} else {

									output = output + LINE_SEPARATOR + "dumb";

								}
								checkFlg = true;
								break;

								// 3のつく1000以下の非負整数の場合
							} else {

								if (output.isEmpty()) {
									output = "stupid";
								} else {

									output = output + LINE_SEPARATOR + "stupid";

								}
								checkFlg = true;
								break;

							}
						}
					}

					// 3のつかない場合
					if(!checkFlg) {
						// 3の倍数の1000以下の非負整数の場合
						if (num % 3 == 0) {

							if (output.isEmpty()) {
								output = "idiot";
							} else {

								output = output + LINE_SEPARATOR + "idiot";

							}
							checkFlg = true;

						} else {

							if (output.isEmpty()) {
								output = "smart";
							} else {

								output = output + LINE_SEPARATOR + "smart";

							}
							checkFlg = true;

						}
					}
				} else {

					if (output.isEmpty()) {
						output = "invalid";
					} else {

						output = output + LINE_SEPARATOR + "invalid";

					}
					checkFlg = true;
				}

			} catch (NumberFormatException e) {

				if (output.isEmpty()) {
					output = "invalid";
				} else {

					output = output + LINE_SEPARATOR + "invalid";

				}

			}
		}

		System.out.println(output);

	}
}
