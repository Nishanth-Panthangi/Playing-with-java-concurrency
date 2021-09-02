There are two ways to create a new thread of execution. One is to declare a class to be a subclass of the Thread class. This subclass should override the run method of the Thread class. An instance of the subclass can then be allocated and started.

The other way to create a thread is to declare a class that implements the Runnable interface. That class then implements the run method. An instance of the class can then be allocated, passed as an argument when creating Thread, and started.
