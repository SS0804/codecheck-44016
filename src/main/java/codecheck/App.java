package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		String separator = "\r\n";

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

									//TODO
									System.out.println(output);

									output = output + separator + "dumb";

									//TODO
									System.out.println(output);

								}
								checkFlg = true;
								break;
								// 3のつく1000以下の非負整数の場合
							} else {

								if (output.isEmpty()) {
									output = "stupid";
								} else {
									//TODO
									System.out.println(output);

									output = output + separator + "stupid";

									//TODO
									System.out.println(output);
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

								//TODO
								System.out.println(output);
								output = output + separator + "idiot";

								//TODO
								System.out.println(output);

							}
							checkFlg = true;

						} else {

							if (output.isEmpty()) {
								output = "smart";
							} else {

								//TODO
								System.out.println(output);
								output = output + separator + "smart";

								//TODO
								System.out.println(output);

							}
							checkFlg = true;

						}
					}
				} else {

					if (output.isEmpty()) {
						output = "invalid";
					} else {

						//TODO
						System.out.println(output);
						output = output + separator + "invalid";
						//TODO
						System.out.println(output);

					}
					checkFlg = true;
				}

			} catch (NumberFormatException e) {
				output = "invalid";
			}

		}

		System.out.println(output);

	}
}
