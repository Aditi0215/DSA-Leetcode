class Solution {
    public String defangIPaddr(String address) {
        String replaced = address.replace(".","[.]");
         return replaced;
    }
}