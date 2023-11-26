package week_12.assignments.Question_12_09;

public class BinaryFormatException extends Exception {
    private String binary;

    public BinaryFormatException() throws BinaryFormatException {

    }

    public BinaryFormatException(String binary) throws BinaryFormatException {
        super("It is not a binary string.!");
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }

    public int bin2Dec(String binary) throws BinaryFormatException {

        int result = 0;
        if (isBinary(binary)) {
            for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
                char ch = binary.charAt(i);
                int digit = ch - '0';
                result += (digit * (int) Math.pow(2, j));
            }
            return result;
        } else {
            throw new BinaryFormatException(super.toString());
        }

    }

    public boolean isBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }


}
