public class dreiASP2022 {
static boolean SucheMAC(String[] mac_liste, String mac_gegeben) {
for (String e: mac_liste) {
  if (e.equals(mac_gegeben)) {
    return true;
  } else {
    return false;
  }
}
}
public static void
  main(String[] args) {
String[] mac_listen = {"EE-AA-01-2A-22-4B", "AA-20-B4-44-5C-41-0A"};
String mac_gegeben = "AA-20-B4-44-5C-41-0A";
boolean result = SucheMAC(mac_listen, mac_gegeben);
    System.out.println(result);



}
}
