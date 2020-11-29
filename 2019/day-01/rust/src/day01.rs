use std::fs;
use std::io::{self, BufRead};

pub fn run() -> usize {
    let file = fs::File::open("../data/input.txt").unwrap();
    let mut reader = io::BufReader::new(file);

    let mut buffer = String::new();

    let mut total = 0;
    loop {
        if reader.read_line(&mut buffer).unwrap() == 0 {
            break;
        }
        let n = buffer.trim().parse::<usize>().unwrap();
        let m = match (n / 3).checked_sub(2) {
            Some(m) => m,
            None => 0,
        };

        total += m;
        buffer.clear();
    }

    total
}
