package algorithmbasic2020.class24;

import java.util.LinkedList;

// 测试链接：https://leetcode.com/problems/gas-station
public class Code03_GasStation {

	// 这个方法的时间复杂度O(N)，额外空间复杂度O(N)
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		boolean[] good = goodArray(gas, cost);
		for (int i = 0; i < gas.length; i++) {
			if (good[i]) {
				return i;
			}
		}
		return -1;
	}

	public static boolean[] goodArray(int[] g, int[] c) {
		int N = g.length;
		int M = N << 1;
		int[] arr = new int[M];
		for (int i = 0; i < N; i++) {
			arr[i] = g[i] - c[i];
			arr[i + N] = g[i] - c[i];
		}
		for (int i = 1; i < M; i++) {
			arr[i] += arr[i - 1];
		}
		LinkedList<Integer> w = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			while (!w.isEmpty() && arr[w.peekLast()] >= arr[i]) {
				w.pollLast();
			}
			w.addLast(i);
		}
		boolean[] ans = new boolean[N];
		for (int offset = 0, i = 0, j = N; j < M; offset = arr[i++], j++) {
			if (arr[w.peekFirst()] - offset >= 0) {
				ans[i] = true;
			}
			if (w.peekFirst() == i) {
				w.pollFirst();
			}
			while (!w.isEmpty() && arr[w.peekLast()] >= arr[j]) {
				w.pollLast();
			}
			w.addLast(j);
		}
		return ans;
	}

}
        /* 加油站
		中等
		1.4K
		相关企业
		在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
		你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
		给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。

		示例 1:
		输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
		输出: 3
		解释:
		从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
		开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油
		开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油
		开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油
		开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油
		开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。
		因此，3 可为起始索引。

		示例 2:
		输入: gas = [2,3,4], cost = [3,4,3]
		输出: -1
		解释:
		你不能从 0 号或 1 号加油站出发，因为没有足够的汽油可以让你行驶到下一个加油站。
		我们从 2 号加油站出发，可以获得 4 升汽油。 此时油箱有 = 0 + 4 = 4 升汽油
		开往 0 号加油站，此时油箱有 4 - 3 + 2 = 3 升汽油
		开往 1 号加油站，此时油箱有 3 - 3 + 3 = 3 升汽油
		你无法返回 2 号加油站，因为返程需要消耗 4 升汽油，但是你的油箱只有 3 升汽油。
		因此，无论怎样，你都不可能绕环路行驶一周。

		提示:
		gas.length == n
		cost.length == n
		1 <= n <= 105
		0 <= gas[i], cost[i] <= 104 */