package com.sbabenko.lc.t811;

import java.util.*;
import java.util.stream.Collectors;

public class SubDomainVisitCount {

    private static final int DOMAIN_INDEX = 1;
    private static final int COUNT_INDEX = 0;

    public List<String> subdomainVisits(String[] cpdomains) {

        Set<Pair<Integer, String>> subDomainsList = new HashSet<>();
        Collection<Pair<Integer, String>> origin = new ArrayList<>();

        for (String line : cpdomains) {
            String[] parts = line.split("\\s");
            String domain = parts[DOMAIN_INDEX];
            origin.add(Pair.of(Integer.parseInt(parts[COUNT_INDEX]), domain));
            String[] subDomains = domain.split("(^[a-zA-Z]*.)");
            while (subDomains.length > 0) {
                subDomainsList.add(Pair.of(0, subDomains[1]));
                subDomains = subDomains[1].split("(^[a-zA-Z]*.)");
            }
        }
        origin = mergeDuplicates(origin);
        origin.forEach(pair -> subDomainsList.forEach(subPair -> compareAndSet(pair, subPair)));
        subDomainsList.addAll(origin);
        return subDomainsList.stream()
                .map(pair -> String.format("%d %s", pair.getLeft(), pair.getRight()))
                .collect(Collectors.toList());
    }

    private Collection<Pair<Integer, String>> mergeDuplicates(Collection<Pair<Integer, String>> collection) {

        Map<String, Pair<Integer, String>> withoutDuplicates = new HashMap<>();
        Set<Pair<Integer, String>> filter = new HashSet<>();

        for (Pair<Integer, String> pair : collection) {
            if(filter.add(pair)) {
                withoutDuplicates.put(pair.right, pair);
            } else {
                withoutDuplicates.put(pair.getRight(), Pair.of(pair.getLeft() + withoutDuplicates.get(pair.right).getLeft(), pair.right));
            }
        }
        return withoutDuplicates.values();
    }

    private void compareAndSet(Pair<Integer, String> origin, Pair<Integer, String> subDomain) {

        if (origin.getRight().endsWith(subDomain.getRight())) {
            subDomain.setLeft(subDomain.getLeft() + origin.getLeft());
        }
    }

    private static class Pair<L, R> {

        private L left;
        private R right;

        private Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }

        public void setLeft(L left) {
            this.left = left;
        }

        public void setRight(R right) {
            this.right = right;
        }

        public static <L, R> Pair of(L left, R right) {
            return new Pair<>(left, right);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(getRight(), pair.getRight());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getRight());
        }
    }
}
