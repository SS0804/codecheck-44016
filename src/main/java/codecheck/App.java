package codecheck;

public class App {
	public static void main(String[] args) {

		System.out.println(args[0]);

		String in = null;
		String output = null;

		for (int i = 0, l = args.length; i < l; i++) {

			if (i == 0) {
				in = args[i];
			} else {
				in = in + args[i];
			}

		}

		int check = Integer.parseInt(in);


		// 1000以下の場合
		if(check <= 1000) {

			for (int i = 0; i < in.length(); i++) {

				// 3のつく場合
				if ("3" == String.valueOf(in.charAt(i))) {
					// 3の倍数でかつ3のつく1000以下の非負整数の場合
					if (0 == check % 3) {
						output = "dumb";
						// 3のつく1000以下の非負整数の場合
					} else {
						output = "stupid";
					}

					// 3のつかない場合
				} else {
					// 3の倍数の1000以下の非負整数の場合
					if (0 == check % 3) {
						output = "idiot";
					} else {
						output = "smart";
					}

				}
			}

		} else {
			output = "invalid";
		}

			System.out.println(output);

	}
}
