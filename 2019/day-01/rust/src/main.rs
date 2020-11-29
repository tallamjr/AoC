use std::path::PathBuf;
use structopt::StructOpt;

use day_01;

#[derive(Debug, StructOpt)]
struct Opt {
    /// Activate debug mode
    // short and long flags (-d, --debug) will be deduced from the field's name
    #[structopt(short, long)]
    debug: bool,

    /// Optional Path to Input file, if not supplied, read from stdin
    #[structopt(parse(from_os_str))]
    input: Option<PathBuf>,

    /// Output file, stdout if not present
    #[structopt(parse(from_os_str))]
    output: Option<PathBuf>,

    /// File name: only required when `out-type` is set to `file`
    #[structopt(name = "FILE", required_if("out-type", "file"))]
    file_name: Option<String>,
}

fn main() {
    let opt = Opt::from_args();
    println!("{:?}", opt);
    match opt.input {
        Some(path) => unimplemented!(),
        None => unimplemented!(),
    }

    let answer = day_01::day01::run();

    println!("{}", answer);
}
