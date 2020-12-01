# Find the two entries in ../data/input.txt that sum to 2020, then multiply these numbers together
# to get the final result

# Intial algorithm guess, check each number againt every other and see if they equal 2020
# https://stackoverflow.com/questions/3277503/how-to-read-a-file-line-by-line-into-a-list

# Another idea could be to use binary search of the ordered list
import itertools

from pathlib import Path
input_data = f"{Path(__file__).absolute().parent.parent}/data/input.txt"


def read_file_as_list(filename) -> list:
    with open(filename) as f:
        lines = f.read().splitlines()
        lines = list(map(int, lines))
        lines.sort()

    return lines


lines = read_file_as_list(input_data)


def find_two_items_equal_to_2020(item_list):
    # Part 1
    for a, b in itertools.combinations(lines, 2):
        if a + b == 2020:
            return a, b


a, b = find_two_items_equal_to_2020(lines)
print(a, b)
print(f"Expenses to pay: {a * b}")


def part_one(filename):

    lines = read_file_as_list(filename)
    a, b = find_two_items_equal_to_2020(lines)

    answer = a * b

    return answer


def find_three_items_equal_to_2020(item_list):
    # Part 2
    for a, b, c in itertools.combinations(lines, 3):
        if a + b + c == 2020:
            return a, b, c


a, b, c = find_three_items_equal_to_2020(lines)
print(a, b, c)
print(f"Expenses to pay: {a * b * c}")


def part_two(filename):

    lines = read_file_as_list(filename)
    a, b, c = find_three_items_equal_to_2020(lines)

    answer = a * b * c

    return answer
