use itertools::Itertools;
use std::fs;

fn main() {
    let items = read_input("../data/input.txt");
    let ans1 = day1(&items, 2);

    println!("Day 1 Part 1 = {}", ans1);
    let ans2 = day1(&items, 3);
    println!("Day 1 Part 2 = {}", ans2);
}

fn read_input(file_name: &str) -> Vec<i32> {
    let file_contents =
        fs::read_to_string(file_name).expect("Something went wrong reading the file");

    let lines: Vec<i32> = file_contents.lines().map(|x| x.parse().unwrap()).collect();

    return lines;
}

fn day1(items: &Vec<i32>, k: usize) -> i32 {
    let zip_items = items.iter().combinations(k);
    let sums: Vec<_> = zip_items
        .filter(|x| x.iter().map(|y| *y).sum::<i32>() == 2020)
        .collect();
    assert_eq!(sums.len(), 1, "Returned more than one value");
    let part1_ans = sums[0].iter().map(|x| *x).product();
    return part1_ans;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_day1() {
        let items = read_input("../data/input.txt");
        let answer1 = day1(&items, 2);
        assert_eq!(answer1, 703131);
        let answer2 = day1(&items, 3);
        assert_eq!(answer2, 272423970);
    }
}
