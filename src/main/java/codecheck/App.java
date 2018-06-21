package codecheck;

public class App {
	public static void main(String[] args) {

//		System.out.println(args[0]);

		String separator = "\r\n";

		String in = null;
		String output = null;


//		for (int i = 0, l = args[0].length(); i < l; i++) {
//
//			args[0].charAt(i);
//
//
//			if (i == 0) {
//				in = args[i];
//			} else {
//				in = in + args[i];
//			}
//
//		}

		in = args[0];

		int check = Integer.parseInt(args[0]);


		// 1000以下の場合
		if(check <= 1000) {

			for (int i = 0; i < in.length(); i++) {

				System.out.println(String.valueOf(in.charAt(i)));

				// 3のつく場合
				if ("3" == String.valueOf(in.charAt(i))) {
					// 3の倍数でかつ3のつく1000以下の非負整数の場合
					if (0 == check % 3) {
						output = "dumb";
						break;
						// 3のつく1000以下の非負整数の場合
					} else {
						output = "stupid";
						break;
					}
				}
			}

			// 3のつかない場合
			if(output ==null) {
				// 3の倍数の1000以下の非負整数の場合
				if (0 == check % 3) {
					output = "idiot";
				} else {
					output = "smart";
				}
			}
		} else {
			output = "invalid";
		}

			System.out.println(output);

	}
}
