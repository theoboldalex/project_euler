<?php

function fib(int $n): int {
    if ($n === 0 || $n === 1) {
        return $n;
    }

    return fib($n - 1) + fib($n -2);
}

function fibSeq(int $limit): array {
    $seq = [];

    for ($i = 0; $i <= $limit; $i++) {
        $seq[] = fib($i);
    }

    return $seq;
}

echo array_reduce(array_filter(fibSeq(33), fn ($i) => $i % 2 === 0), fn ($a, $b) => $a + $b);
