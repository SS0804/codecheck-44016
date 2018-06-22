package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

//		String separator = "\r\n";

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

									//TODO
									System.out.println("連結前：" + output);

									output = output + LINE_SEPARATOR + "dumb";

									//TODO
									System.out.println("連結後：" + output);

								}
								checkFlg = true;
								break;
								// 3のつく1000以下の非負整数の場合
							} else {

								if (output.isEmpty()) {
									output = "stupid";
								} else {
									//TODO
									System.out.println("連結前：" + output);

									output = output + LINE_SEPARATOR + "stupid";

									//TODO
									System.out.println("連結後：" + output);
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
								System.out.println("連結前：" + output);
								output = output + LINE_SEPARATOR + "idiot";

								//TODO
								System.out.println("連結後：" + output);

							}
							checkFlg = true;

						} else {

							if (output.isEmpty()) {
								output = "smart";
							} else {

								//TODO
								System.out.println("連結前：" + output);
								output = output + LINE_SEPARATOR + "smart";

								//TODO
								System.out.println("連結後：" + output);

							}
							checkFlg = true;

						}
					}
				} else {

					if (output.isEmpty()) {
						output = "invalid";
					} else {

						//TODO
						System.out.println("連結前：" + output);
						output = output + LINE_SEPARATOR + "invalid";
						//TODO
						System.out.println("連結後：" + output);

					}
					checkFlg = true;
				}

			} catch (NumberFormatException e) {
				//TODO
				System.out.println("連結前：" + output);
				output = output + LINE_SEPARATOR + "invalid";
				//TODO
				System.out.println("連結後：" + output);
			}

		}

		System.out.println(output);

	}
}
