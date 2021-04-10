class CharSort {
    public static void swap(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
      char c = paramArrayOfchar[paramInt1];
      paramArrayOfchar[paramInt1] = paramArrayOfchar[paramInt2];
      paramArrayOfchar[paramInt2] = c;
    }
    
    public static int partition(char[] arrayOfChar, int leftBoundary, int rightBoundary) {
      char privot = arrayOfChar[rightBoundary];
      int i = leftBoundary;
      for (int j = leftBoundary; j <= rightBoundary - 1; j++) {
        if (arrayOfChar[j] < privot) {
          swap(arrayOfChar, i, j);
          i++;
        } 
      } 
      swap(arrayOfChar, i, rightBoundary);
      return i;
    }
    //quick sort?
    public static void sort(char[] arrayOfChar, int leftBoundary, int rightBoundary) {
      if (leftBoundary < rightBoundary) {
        int pivot = partition(arrayOfChar, leftBoundary, rightBoundary);
        sort(arrayOfChar, leftBoundary, pivot - 1);
        sort(arrayOfChar, pivot + 1, rightBoundary);
      } 
    }
    
    public static String sortString(String paramString) {
      int i = paramString.length();
      char[] arrayOfChar = paramString.toCharArray();
      sort(arrayOfChar, 0, i - 1);
      return new String(arrayOfChar);
    }
  }
  