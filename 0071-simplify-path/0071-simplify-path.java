class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        int p = 0;

        while (p < path.length()) {

            // skip '/'
            if (path.charAt(p) == '/') {
                p++;
                continue;
            }

            StringBuilder sb = new StringBuilder();

            // build one directory
            while (p < path.length() && path.charAt(p) != '/') {
                sb.append(path.charAt(p));
                p++;
            }

            String dir = sb.toString();

            if (dir.equals(".")) {
                // do nothing
            }
            else if (dir.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else {
                st.push(dir);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String dir : st) {
            ans.append("/").append(dir);
        }

        if(ans.length() == 0 )return "/" ;
        return ans.toString();
    }
}