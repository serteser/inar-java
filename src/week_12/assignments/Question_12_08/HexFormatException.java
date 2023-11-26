package week_12.assignments.Question_12_08;

public class HexFormatException extends Exception {
    private String hex;

    public HexFormatException() {

    }

    public HexFormatException(String hex) {
        super("It is not a hex string.!");
        this.hex=hex;
    }

    public String getHex() {
        return hex;
    }

    public  boolean isHexString(String hex) throws HexFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!Character.isLetterOrDigit(ch) || (!('A' <= Character.toUpperCase(ch) && Character.toUpperCase(ch) <= 'F')
                    && !('0' <= Character.toUpperCase(ch) && Character.toUpperCase(ch) <= '9'))) {

                throw new HexFormatException(super.toString());
            }
        }
        return true;
    }

    public  int hexToDecimal(String hex) throws HexFormatException {

        int decimalValue = 0;
        if (isHexString(hex)) {
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        }
        return decimalValue;
    }

    public  int hexCharToDecimal(char hexChar) {
        if ('A' <= Character.toUpperCase(hexChar) && Character.toUpperCase(hexChar) <= 'F') {
            return 10 + (hexChar - 'A');
        } else {
            return hexChar - '0';
        }
    }
}
