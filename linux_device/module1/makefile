#create 1/29/18
obj-m := hello.o
KERNELDIR := /lib/modules/`uname -r`/build
all:
$(MAKE) -C $(KERNELDIR) SUBDIRS=$(CURDIR) modules
clean:
rm -rf $(obj-m) $(obj-m:.o=.mod.c) $(obj-m:.o=.mod.o)
