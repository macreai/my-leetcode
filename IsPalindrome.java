class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x >= 0) {
            if (x >= 0) {
            String number = String.valueOf(x);
            StringBuilder reverseNumber = new StringBuilder();

            for (int i = number.length() - 1; i >= 0; i--) {
                reverseNumber.append(number.charAt(i));
            }

            if (reverseNumber.toString().equals(number)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

        } else {
            return false;
        }

    }
}
