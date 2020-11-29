use std::io;

pub fn run<R>(mut input: R) -> usize
where
    R: io::BufRead,
{
    let mut buffer = String::new();

    let mut total = 0;
    loop {
        if input.read_line(&mut buffer).unwrap() == 0 {
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
