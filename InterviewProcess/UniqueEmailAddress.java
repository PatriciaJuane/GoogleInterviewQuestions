/*Online Assessment Question*/

class Solution {
  public int numUniqueEmails(String[] emails) {
    if (emails == null || emails.length == 0) {
      return 0;
    }

    Set<String> seen = new HashSet();
    for (String email : emails) {
      int i = email.indexOf('@');
      String local = email.substring(0, i);
      String domain = email.substring(i);
      if (local.contains("+")) {
        local = local.substring(0, local.indexOf('+'));
      }
      // Note: one should escape the specific character '.', since it is treated as a
      // regex expression.
      local = local.replaceAll("\\.", "");
      seen.add(local + domain); // reformated email
    }

    return seen.size();
  }
}