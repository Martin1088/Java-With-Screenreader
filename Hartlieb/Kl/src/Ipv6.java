public class Ipv6 {
  public static boolean checkIPv6(String ipv6) {
    // aaa:aaaa:aaa:aaaa:aaaa:aaaa:aaaa:aaa Beispiel
    // fe80::020c:f1ff:fe8e:c1da
    ipv6 = ipv6.toLowerCase();
    // test ob mehrere :: vorhanden sind
    String[] test01 = ipv6.split("::");
    if (test01.length > 2 ) {
      return false;
    }
    // test auf :
    String[] test02 = ipv6.split(":");
    if (test02.length > 8) {
      return false;
    }
    for (int i = 0; i < test02.length; i++) {
      if (test02[i].length() > 4) {
        return false;
      }
      //System.out.println(test02[i]);
      for (int j = 0; j < test02[i].length(); j++) {
        //System.out.print(test02[i].charAt(j));
        int numberTest = (test02[i].charAt(j));
        System.out.println(numberTest);
        // zwischen 97 und 102 ist a - e
        // ( numberTest < 0 && numberTest > 9 && numberTest < 97 && numberTest > 102)
        if (numberTest < 0)  {
          return false;
        } else if (numberTest > 102) {
          return false;
        } else if ( numberTest > 9) {
          if (numberTest < 97 ) {
            return false;
          }

        }

      }
    }

    return true;
  }

  public static void main(String[] args) {
    String test = "abcd:ef:020c:f1ff:fe8e:c1da";
  System.out.println(checkIPv6(test));
  }
}
