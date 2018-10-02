package com.sbabenko.lc.t893;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroupSpecialEquivalentStringTest {

    @ParameterizedTest
    @MethodSource("strings")
    void numSpecialEquivGroups(String[] input, int expected) {

        var specialEquivGroup = new GroupSpecialEquivalentString();
        var result = specialEquivGroup.numSpecialEquivGroups(input);
        assertEquals(expected, result);
    }


    private static Stream<Arguments> strings() {
        return Stream.of(
                Arguments.of(new String[]{"a","b","c","a","c","c"}, 3),
                Arguments.of(new String[]{"aa","bb","ab","ba"}, 4),
                Arguments.of(new String[]{"abc","acb","bac","bca","cab","cba"}, 3),
                Arguments.of(new String[]{"abcd","cdab","adcb","cbad"}, 1),
                Arguments.of(new String[]{"demp","cfhp","dzvf","ggxe","hkte","clug","nhgk","hvwj","zozr","datm","hisr","gfry","jknr","laju","emsf","duwe","ilta","gjrd","woaq","zhdm","ujmz","jalu","tkhe","gexg","hrsi","tail","ilta","xegg","srhi","clug","cgul","gexg","tehk","ulcg","xgge","cgul","hrsi","aowq","jalu","laju","vzdf","gexg","hpcf","zhdm","hfcp","zhdm","ulcg","jalu","ggxe","gexg","nkgh","hrsi","vfdz","nkgh","cgul","hpcf","hetk","zrzo","xegg","nkgh","srhi","smef","ulcg","hrsi","ggxe","ggxe","efsm","ggxe","jalu","srhi","dmzh","laju","zmdh","sfem","tehk","srhi","wqao","gknh","jalu","iatl","gexg","ugcl","nkgh","hrsi","srhi","hkte","gdrj","zozr","hisr","sihr","smef","zmdh","clug","iatl","cgul","woaq","jrnk","sihr","xegg","luja"}, 21));
    }
}