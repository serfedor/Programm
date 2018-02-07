obj-m += hello.o

hello:
	make ARCH=i386 -C ~/linux_sources/linux-4.14.15/drivers/modules M=$(pwd) modules

clean:
	rm -f built-in.o hello.ko hello.mod.* modules.order Module.symvers hello.o
