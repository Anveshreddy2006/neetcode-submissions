class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for(String s : emails){
            String[] a = s.split("@");
            String local = a[0];
            String doo = a[1];
            local = local.split("\\+")[0];
            local = local.replace(".","");
            set.add(local + "@"+doo);
        }
        return set.size();
    }
}