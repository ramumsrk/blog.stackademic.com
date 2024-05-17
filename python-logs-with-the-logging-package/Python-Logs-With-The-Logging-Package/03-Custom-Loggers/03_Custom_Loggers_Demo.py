#! /usr/bin/python3.12

import logging

from pathlib import Path

# User-defined function
def test_logging() -> None:
  test_logger : logging.Logger = logging.getLogger('test_logger')
  test_logger.setLevel(logging.DEBUG)
  test_handler : logging.StreamHandler = logging.StreamHandler()
  test_handler.setLevel(logging.DEBUG)
  test_formatter : logging.Formatter = logging.Formatter(
    '%(asctime)s - %(name)s - %(levelname)s - %(message)s'
  )
  test_handler.setFormatter(test_formatter)
  test_logger.addHandler(test_handler)
  test_logger.debug( "DEBUG" )
  test_logger.info( "INFO" )
  test_logger.warning( "WARNING" )
  test_logger.error( "ERROR" )
  test_logger.critical( "CRITICAL" )
  test_handler.close()
  return None

if __name__ == '__main__':

  # Function call
  test_logging()