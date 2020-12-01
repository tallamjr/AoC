from day01 import part_one, part_two


def test_part_one():

    answer = part_one("../data/input.txt")
    assert answer == 703131


def test_part_two():

    answer = part_two("../data/input.txt")
    assert answer == 272423970
