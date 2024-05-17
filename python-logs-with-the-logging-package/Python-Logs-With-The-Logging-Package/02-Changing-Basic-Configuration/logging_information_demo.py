#! /usr/bin/python3.12

import logging

from pathlib import Path

# User-defined function
def test_logging() -> None:
  # Path to log-file
  log_file_path : Path = Path(__file__).parent
  # Log-file name
  log_file : str = F'{log_file_path}/logging_information_demo.log'
  logging.basicConfig(
    level=logging.DEBUG,
    format="%(asctime)s | %(levelname)s | %(message)s",
    datefmt="%Y-%m-%d %H:%M:%S",
    filename=f'{log_file}'
  )
  list_of_animals : list[str] = [
    "Dog",
    "Cat",
  ]
  for animal in list_of_animals:
    logging.debug( f'{animal} is your animal' )

if __name__ == '__main__':

  # Function call
  test_logging()