package L08_Midterm;

import java.util.Scanner;

public class ValidEmail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (3 <= string.length()) {
            String localPart = "";
            String domainName = "";
            boolean firstSlit = false;
            for (int i = 0; i < string.length(); i++) {
                if (!firstSlit && string.charAt(i) == '@') {
                    firstSlit = true;
                } else {
                    if (!firstSlit) {
                        localPart += string.charAt(i);
                    }
                    if (firstSlit) {
                        domainName += string.charAt(i);
                    }
                }
            }
//            System.out.println("localPart: " + localPart);
//            System.out.println("domainName: " + domainName);

            // local part
            boolean isLocalNameValid = true;
            boolean isCharacter = false;
//            boolean isNumber = false;
            boolean isSpecialCharacter = false;
            for (int i = 0; i < localPart.length(); i++) {
                if ('a' <= localPart.charAt(i) && localPart.charAt(i) <= 'z' ||
                        'A' <= localPart.charAt(i) && localPart.charAt(i) <= 'Z' ||
                        '0' <= localPart.charAt(i) && localPart.charAt(i) <= '9') {
                    isCharacter = true;
                }
                if (localPart.charAt(i) == '.' || localPart.charAt(i) == '_') {
                    isSpecialCharacter = true;
                }
            }
            if (isCharacter && isSpecialCharacter) {
                isLocalNameValid = true;
            } else {
                isLocalNameValid = false;
            }

            // domain name
            boolean isDomainNameValid = true;
            boolean firstDot = false;
            boolean isTwoConsecutiveDot = false;
            boolean isContainSpecialCharacter = false;
            for (int i = 0; i < domainName.length(); i++) {
                if (!isContainSpecialCharacter && domainName.charAt(i) == '@') {
                    isContainSpecialCharacter = true;
                } else if (domainName.charAt(i) == '.') {
                    firstDot = true;
                }
                if (i > 0 && domainName.charAt(i) == '.' && domainName.charAt(i - 1) == '.') {
                    isTwoConsecutiveDot = true;
                    isDomainNameValid = false;
                    break;
                }
            }

            if (isLocalNameValid &&
                    isDomainNameValid &&
                    firstDot &&
                    !isTwoConsecutiveDot
                    && !isContainSpecialCharacter
            ) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
