package zudin.task7;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Long> longs = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        CalculationFunctions.addStrings(strings);
        CalculationFunctions.addLongs(longs);
        CalculationFunctions.addInts(ints);
        CalculationFunctions.addPersons(persons);

        CalculationFunctions.findStrings(strings);
        CalculationFunctions.findLongs(longs);
        CalculationFunctions.findInts(ints);
        CalculationFunctions.findPersons(persons);


        List<Double> testArrayList = new ArrayList<>();
        List<Double> testLinkedList = new LinkedList<>();
        Set<Double> testHashSet = new HashSet<>();
        Set<Double> testTreeSet = new TreeSet<>();

        CalculationFunctions.addDouble(testArrayList);
        CalculationFunctions.addDouble(testLinkedList);
        CalculationFunctions.addDouble(testHashSet);
        CalculationFunctions.addDouble(testTreeSet);

        CalculationFunctions.findDouble(testArrayList);
        CalculationFunctions.findDouble(testLinkedList);
        CalculationFunctions.findDouble(testHashSet);
        CalculationFunctions.findDouble(testTreeSet);

    }
}

/*
#############################################
addStrings:
#############################################
25024411
8473982
3585692
3033779
880331
3985535
808376
842906
15001576
599767

addStrings
Average is: 6223635
#############################################

#############################################
addLongs:
#############################################
9417711
5742087
4736644
5001294
4160369
20121971
516290
668103
3983855
701363

addLongs:
Average is: 5504968
#############################################

#############################################
addInts:
#############################################
7016435
14415105
9983453
6136391
465617
5091944
714560
508724
4495279
432208

addInts:
Average is: 4925971
#############################################

#############################################
addPersons:
#############################################
657555371
12186275
4585389
2269117
894803
2857815
870048
1110613
9859704
1094824

addPersons:
Average is: 69328395
#############################################

#############################################
findStrings:
#############################################
18912
1458
1152
1112
1126
1118
1074
1101
1109
1220

findStrings:first element
Average is: 2938

13130601
16127594
3466375
2877555
3237353
2881584
3286174
3058577
2998093
2969480

findStrings:absent element
Average is: 5403338

266844
369709
4899953
2723179
2344736
531457
601580
596450
612586
632146

findStrings:last element
Average is: 1357864
#############################################

#############################################
findLongs:
#############################################
70211
3418
2353
2684
2406
5939
2402
2494
2255
69823

findLongs:first element
Average is: 16398

41411996
2151461
2192143
1825409
2123120
1556246
1978273
1633807
1977500
2095021

findStrings:absent element
Average is: 5894497

247789
319508
3211223
7749065
2455211
2481602
2577250
2482560
2222041
833406

findLongs:last element
Average is: 2457965
#############################################

#############################################
findInts:
#############################################
49326
2200
1713
1678
1853
1647
1652
1866
1672
1888

findInts:first element
Average is: 6549

40670070
9215314
10784191
9910133
10849504
13108123
10771117
9938961
8869976
10226377

findStrings:absent element
Average is: 13434376

12978756
10570780
7013585
6910566
7005626
8283627
9854567
9349824
8647474
7114452

findLongs:last element
Average is: 8772925
#############################################

#############################################
findPersons:
#############################################
2432
943
1118
877
919
1214
1061
983
1113
1046

findPersons:first element
Average is: 1170

9139699
9365650
9802170
9830866
9995738
10131288
7191849
11814349
7341538
9269713

findPersons:absent element
Average is: 9388286

1117915
1726333
737217
599203
585398
542349
518475
517281
517626
585764

findPersons:last element
Average is: 744756
#############################################

#############################################
Add elements in ArrayList
#############################################
13039162
4338959
3904245
4880519
3234235
656501445
1580228
1666987
5722906
2114516

Add elements in ArrayList
Average is: 69698320
#############################################

#############################################
Add elements in LinkedList
#############################################
15628097
16693281
11539388
62224451
1895973
1706575
2167442
1800309
80845442
1800078

Add elements in LinkedList
Average is: 19630103
#############################################

#############################################
Add elements in HashSet
#############################################
125717632
32699958
152562776
22743253
18165018
21954233
18753921
18489916
20293073
16698587

Add elements in HashSet
Average is: 44807836
#############################################

#############################################
Add elements in TreeSet
#############################################
877217629
29491078
15191212
15286676
15168829
15133935
58526995
10495066
10627345
10608326

Add elements in TreeSet
Average is: 105774709
#############################################

#############################################
Find first element in ArrayList
#############################################
46551
1115
588
593
603
577
579
12832
663
601

Find first element in ArrayList
Average is: 6470
#############################################

#############################################
Find last element in ArrayList
#############################################
3458904
1474777
1529656
2030140
2077418
1416306
1450415
1368567
1318628
1447563

Find last element in ArrayList
Average is: 1757237
#############################################

#############################################
Find first element in LinkedList
#############################################
5565
1363
1428
1266
1060
15290
1390
1240
1341
1353

Find first element in LinkedList
Average is: 3129
#############################################

#############################################
Find last element in LinkedList
#############################################
8477485
2803961
2468153
3275481
2855892
3162150
2079674
3239845
1679603
1314558

Find last element in LinkedList
Average is: 3135680
#############################################

#############################################
Find first element in HashSet
#############################################
62377
1614
847
826
812
754
785
739
773
712

Find first element in HashSet
Average is: 7023
#############################################

#############################################
Find last element in HashSet
#############################################
12516
1312
878
1355
1353
1627
2798
917
919
822

Find last element in HashSet
Average is: 2449
#############################################

#############################################
Find first element in TreeSet
#############################################
27773
2460
1825
2280
2522
2430
2974
1783
1699
1608

Find first element in TreeSet
Average is: 4735
#############################################

#############################################
Find last element in TreeSet
#############################################
9204
2777
2773
2752
2719
2728
2817
2730
2679
2892

Find last element in TreeSet
Average is: 3407
#############################################


Process finished with exit code 0*/


