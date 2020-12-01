from day01 import part_one, part_two

from pathlib import Path
input_data = f"{Path(__file__).absolute().parent.parent}/data/input.txt"


def test_part_one():

    answer = part_one(input_data)
    assert answer == 703131


def test_part_two():

    answer = part_two(input_data)
    assert answer == 272423970
