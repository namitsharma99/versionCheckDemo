package versionCheckDemo;

/**
 * @author namit
 * @version 1.0
 * 
 * */
public class VersionTester {

  public static void main(String[] args) {

    System.out.println("Part 1 - Generalize the version numbers to a standard format - a.b.c");

    String input = "1.1";
    update(input);

    input = "1.1.1";
    update(input);

    input = "1";
    update(input);

    System.out.println("Part 2 - Get the main digit representing the version number ");

    input = "1.0.1";
    findVersion(input);

    input = "54.1";
    findVersion(input);

    input = "100";
    findVersion(input);

    input = "100.c.c";
    findVersion(input);

    input = "100.cc.&@!#$$";
    findVersion(input);

    System.out.println("Part 3 - Comparing the versions, under the format a.b.c ");

    String versionX = "2.3";
    String minVersion = "2.5.5";
    checkVersion(versionX, minVersion);

    versionX = "2.7.9";
    minVersion = "2.5.5";
    checkVersion(versionX, minVersion);

  }

  /**
   * Method to update the version numbers to a uniform pattern
   * */
  private static void update(String input) {
    System.out.println("incoming >> " + input);
    int occurence = countMatches(input, '.');
    if (occurence == 0)
      input += ".0.0";
    else if (occurence == 1)
      input += ".0";
    System.out.println("outgoing >> " + input);
    System.out.println("---------------");
  }

  public static int countMatches(final CharSequence str, final char ch) {
    if (null == str) {
      return 0;
    }
    int count = 0;

    char[] arr = ((String) str).toCharArray();
    for (char c : arr) {
      if (c == ch)
        count++;
    }
    // likewise you can go for
    // org.apache.commons.lang3.StringUtils.StringUtils.countMatches(str, ch)
    // for saving time of writing the count logic
    return count;
  }

  /**
   * Method to find the main version number
   * */
  private static void findVersion(String input) {
    System.out.println("Incoming >> " + input);
    String inputWithoutDots = input.replace(".", "");
    if (inputWithoutDots.matches("[0-9]+")) {
      int version = 0;
      String[] arr = input.split("\\.");
      version = Integer.valueOf(arr[0]);
      System.out.println("Success! outgoing >> " + version);
    } else {
      System.out.println("error!");
    }
    System.out.println("---------------");
  }

  /**
   * Method to compare the given version with a minimum accepted version
   * */
  private static void checkVersion(String versionX, String minVersion) {
    String minVersionFormatted = String.format("%-4s", minVersion.replace(".", "")).replace(' ', '0');
    int minVersionNum = Integer.valueOf(minVersionFormatted);
    String formattedVersion = String.format("%-4s", versionX.replace(".", "")).replace(' ', '0');
    int versionXNum = Integer.parseInt(formattedVersion);

    System.out.println("Min Version - "+minVersion);
    System.out.println("You provided - "+versionX);
    if (versionXNum >= minVersionNum) {
      System.out.println("Version Accepted!");
    } else {
      System.out.println("Version Rejected!");
    }
    System.out.println("---------------");
  }

}