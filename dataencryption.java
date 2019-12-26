
import java.util.Scanner;
public class dataencryption {
    public static void main(String[] args)
    {
            System.out.println("enter the string");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            System.out.println("enter shift number");
            int h = input.nextInt();
            System.out.println("enter the group number");
            int l = input.nextInt();
            encryptString(s, h, l);
        }

        public static void encryptString(String s, int h, int l) {
            String s5 = normalizeText(s);
            String s6 = ceasarify(s5, h);
            String s7 = groupify(s6, l);
            System.out.println("final encrypted string-- " + s7);
            String s8 = ungroupify(s7);
            String s9 = decrypt(s8, h, l);
            System.out.println("decrypted normalised string-- " + s9);
        }

        public static String normalizeText(String s) {
            s = s.replaceAll("\\s", "");
            s = s.replaceAll("\\p{Punct}", "");
            s = s.toUpperCase();
            return s;
        }

        public static String ceasarify(String s, int h) {
            String s2 = "";
            for (int i = 0; i < s.length(); i++) {
                int g = s.charAt(i);
                g = g + h;
                if (g > 90)
                    g = g - 26;
                char e = (char) g;
                s2 += e;
            }
            return s2;
        }

        public static String groupify(String s, int h) {
            String s3 = "";
            int j = 1;
            for (int i = 0; i < s.length(); i++) {
                s3 += s.charAt(i);
                if (j % h == 0) {
                    s3 += " ";
                }
                j++;
            }
            int m = s.length() % h;
            if (m != 0) {
                for (int u = 1; u <= h - m; u++)
                    s3 += 'x';
            }
            return s3;
        }

        public static String ungroupify(String s) {
            s = s.replaceAll(" ", "");
            s = s.replaceAll("x", "");
            return s;
        }
        public static String decrypt(String s,int h,int l){
            String s2 = "";

            for (int i = 0; i < s.length(); i++) {
                int g = s.charAt(i);
                g = g - h;
                if (g < 65)
                    g = g +26;
                char e = (char) g;
                s2 += e;
            }
            return s2;
        }
    }

