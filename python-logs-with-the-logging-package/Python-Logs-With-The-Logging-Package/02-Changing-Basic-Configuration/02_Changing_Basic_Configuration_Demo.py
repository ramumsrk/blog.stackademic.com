#! /usr/bin/python3.12

import logging

from pathlib import Path

# User-defined function
def test_logging() -> None:
  # Path to the log-file
  log_file_path : Path = Path(__file__).parent
  # Log-file name
  log_file : str = f'{log_file_path}/basic.log'
  logging.basicConfig(
    level=logging.DEBUG,
    format="%(asctime)s | %(levelname)s | %(message)s",
    datefmt="%Y-%m-%d %H:%M:%S",
    filename=f'{log_file}'
  )
  logging.debug( "DEBUGGING" )
  logging.info( "INFO" )
  logging.warning( "WARNING" )
  logging.error( "ERROR" )
  logging.critical( "CRITICAL" )

if __name__ == '__main__':

  # Function call
  test_logging()