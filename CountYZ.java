class CountYZ {

  public int countYZ(String str) {
    String newStr = str.trim().toLowerCase();
    int strLen = newStr.length(); //str length
    int yzCounter = 0;
    boolean isYZ = false;

    for (int x = 0; x < strLen; x++) {
      if (newStr.charAt(x) >= 'a' && newStr.charAt(x) <= 'z') {
        if (newStr.charAt(x) == 'y' || newStr.charAt(x) == 'z') {
          isYZ = true;
        } else {
          isYZ = false;
        }
      } else {
        if (isYZ) {
          yzCounter++;
          isYZ = false;
        }
      }
    }
    if (isYZ) yzCounter++;
    return yzCounter;
  }

  public static void main(String[] args) {
    System.out.println(countYZ("fez day"));
  }
}
