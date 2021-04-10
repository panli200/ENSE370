public class Hash {
    public static short[] getHash(String paramString1, String paramString2) {
      String str = paramString1 + paramString2;
      short[] arrayOfShort = new short[str.length()];
      char[] arrayOfChar = str.toCharArray();
      for (byte b = 0; b < arrayOfChar.length; b++) {
        arrayOfShort[b] = 5;
        for (byte b1 = 0; b1 < arrayOfChar[b]; b1++)
          arrayOfShort[b] = (short)(arrayOfShort[b] + b1 * 3 + 4); 
      } 
      
      return arrayOfShort;
    }
  }
  