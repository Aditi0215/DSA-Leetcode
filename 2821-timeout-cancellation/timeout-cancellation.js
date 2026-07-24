var cancellable = function(fn, args, t) {

    const timer = setTimeout(() => {
        fn(...args);
    }, t);

    return function() {
        clearTimeout(timer);
    };
};