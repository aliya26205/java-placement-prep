public List<Integer> solve(List<Integer> arr) {

    List<Integer> result = new ArrayList<>();

    for (int num : arr) {

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        result.add(sum);
    }

    return result;
}
/*List<Integer> result = new ArrayList<>();

👉 Create an empty answer list.

result.add(sum);

👉 Add that number's answer to our result list.*/
