//package algorithmbasic2020.typical.lesson2;
//
//import java.util.HashMap;
//
///**
//题目七:
//请实现如下结构：
//TopRecord{
//public TopRecord(int K):构造时事先指定好K的大小，构造后就固定不变了
//public void add(String str):向该结构中加入一个字符串，可以重复加入
//public List<String> top():返向之前加入的所有字符串中，词频最大的K个
//}要求：
//add方法，复杂度O(logK);
//top方法，复杂度0(K)
//*/
//public class Code37_TopKTimesRealTime {
//
//    public static class Node {
//        public String str;
//        public int times;
//
//        public Node (String s, int t){
//            str = s;
//            times = t;
//        }
//    }
//
//    public static class TopKRecord {
//        private Node[] heap;
//        private int heapSize;
//        // String -> Node(times)
//        private HashMap<String, Node> strNodeMap;
//        private HashMap<Node, Integer> nodeIndexMap;
//
//        public TopKRecord(int K) {
//            heap = new Node[K];
//            heapSize = 0;
//            strNodeMap = new HashMap<String, Node>();
//            nodeIndexMap = new HashMap<Node, Integer>();
//        }
//
//        // str用户现在给我的
//        public void add(String str) {
//            Node curNode = null;
//            int preIndex = -1; //str之前再堆上的位置
//            //查词频表，看看有没有关于这个str的记录
//            if (!strNodeMap.containsKey(str)) {
//                curNode = new Node(str, 1);
//                strNodeMap.put(str, curNode);
//                nodeIndexMap.put(curNode, -1);
//            } else { // str之前进来过
//                curNode = strNodeMap.get(str);
//                curNode.times++;
//                preIndex = nodeIndexMap.get(curNode);
//            }
//            // 词频表修改完毕
//            if (preIndex == -1) { //不在堆山了
//                if (heapSize == heap.length) { //堆满了
//                    if (heap[0].times < curNode.times) {
//                        nodeIndexMap.put(heap[0], -1);
//                        nodeIndexMap.put(curNode, 0);
//                        heap[0] = curNode;
//                        heapify(0, heapSize);
//                    }
//                } else { // 堆没有满
//                    nodeIndexMap.put(curNode, heapSize);
//                    heap[heapSize] = curNode;
//                    heapInsert(heapSize++);
//                }
//            } else { //str已经在堆上了
//                heapify(preIndex, heapSize);
//            }
//        }
//
//        public void printTopK() {
//            System.out.println("TOP:  ");
//            for (int i = 0; i != heap.length; i++){
//                if (heap[i] == null) {
//                    break;
//                }
//                System.out.println("Str: " + heap[i].str);
//                System.out.println("  Times: " + heap[i].times);
//            }
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//}
