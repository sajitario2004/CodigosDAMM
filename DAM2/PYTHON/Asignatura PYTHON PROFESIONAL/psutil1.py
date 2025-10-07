import psutil

print(psutil.cpu_percent(interval=1))
print(psutil.cpu_count(logical=True))
print(psutil.cpu_freq())
print(psutil.virtual_memory())
print(psutil.swap_memory())
print(psutil.disk_usage())
print(psutil.disk_partitions())
print(psutil.net_io_counters())
print(psutil.net_if_addrs())
print(psutil.sensors_temperatures())
print(psutil.sensors_bate())
