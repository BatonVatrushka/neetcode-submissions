class Solution {
    public int calPoints(String[] operations) {
        List<Integer> rec = new ArrayList<>();
        for (String op : operations) {
            if (op.equals("+")) {
                // add the last two, then add the result
                int last = rec.get(rec.size() - 1);
                int secondLast = rec.get(rec.size() - 2);
                rec.add(last + secondLast);

            }
            else if (op.equals("D")) {
                int last = rec.get(rec.size() - 1); 
                rec.add(last * 2);
            }
            else if (op.equals("C")) {
                rec.remove(rec.size() - 1);
            }
            else {
                rec.add(Integer.parseInt(op));
            }
        }
        int total = 0;
        for (int score : rec) {
            total += score;
        } 
        return total;
    } 
}