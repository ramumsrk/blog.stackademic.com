#! /usr/bin/python3.12

import logging

# User-defined function
def test_logging() -> None:
  logging.basicConfig( level=logging.DEBUG )
  logging.debug( "DEBUG" )
  logging.info( "INFO" )
  logging.warning( "WARNING" )
  logging.error( "ERROR" )
  logging.critical( "CRITICAL" )

if __name__ == '__main__':

  # Function call
  test_logging()  